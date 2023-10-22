package org.example.Structural.Decorator;

public interface DataSource {
    void writeData(String data);

    String readData();
}