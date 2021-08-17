package br.com.vinicio.visitor;

import br.com.vinicio.shapes.Circle;
import br.com.vinicio.shapes.CompoundShape;
import br.com.vinicio.shapes.Dot;
import br.com.vinicio.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);
    String visitCircle(Circle circle);
    String visitRectangle(Rectangle rectangle);
    String visitCompoundGraphic(CompoundShape cg);
}
