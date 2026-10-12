package com.demo.nestedclasses;

public class OuterClass {
    
    // ✅ This is allowed! Only OuterClass can use this.
    private class InnerSecret {
        void display() {
            System.out.println("Hidden from the outside world.");
        }
    }

    public void useInner() {
        InnerSecret secret = new InnerSecret(); // Works fine here
        secret.display();
    }
}
