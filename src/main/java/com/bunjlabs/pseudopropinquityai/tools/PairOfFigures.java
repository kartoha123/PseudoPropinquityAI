package com.bunjlabs.pseudopropinquityai.tools;

import java.util.List;


public class PairOfFigures {
    private List<Point> figureA;
    private List<Point> figureB;
    
    public PairOfFigures(List<Point> figureA, List<Point> figureB) {
        this.figureA = figureA;
        this.figureB = figureB;
    }


    public List<Point> getFigureA() {
        return figureA;
    }


    public List<Point> getFigureB() {
        return figureB;
    }
}
