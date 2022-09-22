package ExerciciosPooJava;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pessoa {

    private String nome;
    private String dataNascimento;
    private float altura;
    private int idade;

    public Pessoa(String nome, String dob, float altura) {
        this.nome = nome;
        this.dataNascimento = dob;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setDataNascimento(String data) {
        this.dataNascimento = data;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public Date converteData(String data) {
        Date date = null;
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            date = formatter.parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return date;
    }

    public String getHoje() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public int getYear(Date entrada) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(entrada);
        int year = calendar.get(Calendar.YEAR);
        return year;
    }

    public int calculaIdade(int anoNascimento, int anoatual) {
        this.idade = anoatual - anoNascimento;
        return this.idade;
    }

}


/*      Pessoa p1 = new Pessoa("Joaquim Guedes", "06/05/1993", 1.75f);

        System.out.println(p1.getNome());

        System.out.println("Nascido em : " + p1.getDataNascimento());
        System.out.println(p1.calculaIdade(p1.getYear(p1.converteData(p1.getDataNascimento())), 2022) + " Anos de idade");

        System.out.println(p1.getAltura() + " de Altura");

 */
