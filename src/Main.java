import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(5);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBomba = new Dev();
        devBomba.setNome("devBomba");
        devBomba.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos devBomba:" + devBomba.getConteudosInscritos());
        devBomba.progredir();
        devBomba.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos devBomba:" + devBomba.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos devBomba:" + devBomba.getConteudosConcluidos());
        System.out.println("XP:" + devBomba.calcularTotalXp());

        System.out.println("-------");

        Dev devBomba2 = new Dev();
        devBomba2.setNome("devBomba2");
        devBomba2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos devBomba2:" + devBomba2.getConteudosInscritos());
        devBomba2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos devBomba2:" + devBomba2.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos devBomba2:" + devBomba2.getConteudosConcluidos());
        System.out.println("XP:" + devBomba2.calcularTotalXp());

    }

}
