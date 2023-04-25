import java.time.LocalDate;
import br.com.dio.desafio.dominio.*;

public class Main {
    public static void main(String[] args) {

        // criando cursos
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);
        System.out.println("Curso1: " + curso1);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("curso JavaScript");
        curso2.setDescricao("descrição curso JavaScript");
        curso2.setCargaHoraria(4);
        System.out.println("Curso2: " + curso2);
        
        // criando mentorias
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now());
        System.out.println("Mentoria1: " + mentoria1);

        // criando bootcamps
        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);
        System.out.println("Bootcamp1: " + bootcamp1);

        System.out.println("---------------");

        // criando devs e interagindo com os objetos, atributos e métodos.
        Dev dev1 = new Dev();
        dev1.setNome("Camila");
        dev1.increverBootcamp(bootcamp1);
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("\n" + dev1.getNome() +" - Conteudos inscritos: " + dev1.getConteudosInscritos());
        System.out.println("\n" + dev1.getNome() +" - Conteudos concluidos: " + dev1.getConteudosConcluidos());
        System.out.println("\n" + dev1.getNome() + " - XP: " + dev1.calcularTotalXp());
        
        Dev dev2 = new Dev();
        dev2.setNome("Haldir");
        dev2.increverBootcamp(bootcamp1);
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("\n" + dev2.getNome() +" - Conteudos inscritos: " + dev2.getConteudosInscritos());
        System.out.println("\n" + dev2.getNome() +" - Conteudos concluidos: " + dev2.getConteudosConcluidos());
        System.out.println("\n" + dev1.getNome() + " - XP: " + dev2.calcularTotalXp());
        

    }

}
