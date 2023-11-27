package Assignment;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ExtensionContext.Namespace;
import org.junit.jupiter.api.extension.ExtensionContext.Store;
import org.junit.jupiter.api.extension.ExtensionContext.Store.CloseableResource;
import org.junit.jupiter.api.extension.RegisterExtension;

class MyExtension implements CloseableResource {
    private String value;

    MyExtension(String value) {
        this.value = value;
    }

    @Override
    public void close() throws Throwable {
        System.out.println("Closing resource: " + value);
    }
}

public class ExtensionDemo {

    @RegisterExtension
    MyExtension extension1 = new MyExtension("Resource 1");

    @RegisterExtension
    MyExtension extension2 = new MyExtension("Resource 2");
}
