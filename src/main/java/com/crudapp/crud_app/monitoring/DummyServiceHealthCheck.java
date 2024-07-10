package com.crudapp.crud_app.monitoring;

import io.swagger.models.auth.In;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Controller;

import java.io.IOError;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

@Controller
public class DummyServiceHealthCheck implements HealthIndicator {


    @Autowired
    private Environment env;

    @Override
    public Health getHealth(boolean includeDetails) {
        return HealthIndicator.super.getHealth(includeDetails);
    }

    @Override
    public Health health() {
        try {
            if (isServiceUp()) {
                return Health.up().withDetail("Util Service", "is working good").build();
            }
            else {
                return Health.down().withDetail("Util Service", "is down").build();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        return null;
    }

    public boolean isServiceUp() throws IOException {
        String address = env.getProperty("utilService.address");
        String port = env.getProperty("utilService.port");

        System.out.println("Address = " + address + "Port = " + port);

        return isAddressReachable(address, Integer.parseInt(port), 4000);

    }

    private static boolean isAddressReachable(String address, int port, int timeout) throws IOException {

        try (Socket isSocket = new Socket()) {
            isSocket.connect(new InetSocketAddress(address, port), timeout);
            return true;
        } catch (IOException exception) {
            exception.printStackTrace();
            return false;
        } finally {
            System.out.println("Finally Block");
        }

    }

}
