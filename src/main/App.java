package main;

import test.Ejercicio_01_insert.InsertBSTTest;
import test.Ejercicio_02_invert.InvertBinaryTreeTest;
import test.Ejercicio_03_listLeves.ListLevelsTest;
import test.Ejercicio_04_depth.DepthTest;
import utils.StudentValidator;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ

        InsertBSTTest ins = new InsertBSTTest();
        ins.bstInsertionTest();
        InvertBinaryTreeTest inv = new InvertBinaryTreeTest();
        inv.invertBinaryTreeTest();
        ListLevelsTest llt = new ListLevelsTest();
        llt.listLevelsTest();
        DepthTest dep = new DepthTest();

    }

}
