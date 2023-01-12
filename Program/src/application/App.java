package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class App {
    public static void main(String[] args) throws Exception {
       
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        /* Se minha lista for uma lista só de círculos vai aconter um
        erro de casting já que List<Shape> não é um supertipo de
        List<Circle>
        
        List<Circle> myCircles = newArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));
        
        System.out.println("Total area: " + totalArea(myCircles));
        
        ERRO DE CASTING - método totalArea funciona somente para a lista
        de Shape - List<Shape>
        
        Se a solução para isso contar com um tipo coringa totalArea(List<?> list)
        compilador vai apontar erro em (Shape s : list) list não é necessariamente
        do tipo Shape 
        É necessário então escrever o método totalArea da seguinte forma: 
        
        totalArea(List<? extends Shape> list)
        Agora a declaração evidencia que minha lista pode ser do tipo Shape, ou de 
        qualquer subtipo de Shape (método agora também aceita uma lista de Circulos) */



        System.out.println("Total area: " + totalArea(myShapes));
    }

    public static double totalArea(List<? extends Shape> list) {
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }
}
