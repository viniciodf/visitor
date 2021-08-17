package br.com.vinicio.shapes;

import br.com.vinicio.visitor.Visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
