package Verisoft;

import org.junit.jupiter.api.extension.*;

public class AditStoreAnnotations implements BeforeAllCallback, AfterAllCallback, AfterEachCallback, BeforeEachCallback {


    @Override
    public void afterAll(ExtensionContext extensionContext) throws Exception {
        System.out.println("END!!!");
    }

    @Override
    public void afterEach(ExtensionContext extensionContext) throws Exception {
        System.out.println("ent test!!!");
    }

    @Override
    public void beforeAll(ExtensionContext extensionContext) throws Exception {
        System.out.println("START!!!");
    }

    @Override
    public void beforeEach(ExtensionContext extensionContext) throws Exception {
        System.out.println("start test!!!");
    }
}
