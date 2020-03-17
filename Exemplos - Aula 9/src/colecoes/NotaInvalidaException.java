/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoes;

/**
 *
 * @author coelho
 */
public class NotaInvalidaException extends Exception {

    public NotaInvalidaException() {
        super("Nota não pode ser menor que zero nem maior que dez.");
    }

    public NotaInvalidaException(String message) {
        super(message);
    }
    
}
