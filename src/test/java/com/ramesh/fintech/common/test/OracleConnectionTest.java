package com.ramesh.fintech.common.test;

import org.junit.jupiter.api.Test;
import org.testcontainers.containers.OracleContainer;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OracleConnectionTest {

    @Test
    void testOracleContainerStart() {
        try (OracleContainer oracle = new OracleContainer("gvenzl/oracle-xe")) {
            oracle.start();
            assertTrue(oracle.isRunning());
        }
    }
}
