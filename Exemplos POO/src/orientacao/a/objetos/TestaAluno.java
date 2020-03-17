/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orientacao.a.objetos;

import java.util.ArrayList;
import java.util.Iterator;
import orientacao.a.objetos.Aluno;

/**
 *
 * @author Coelho
 */
public class TestaAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        
        aluno1.nome = "Rafael";
        aluno1.data = "23/07/1984";
        aluno1.rg = 1071690273;
        aluno1.preenche_notas(7, 8, 10);
        aluno2.nome = "Jorge";
        aluno2.data = "10/02/1979";
        aluno2.rg = 1996570987;
        aluno2.preenche_notas(6, 8, 4);        
        aluno1.mostra_dados();
        aluno2.mostra_dados();
        
        
    }    
}
