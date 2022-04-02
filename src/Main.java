import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(6);

        //Conteudo conteudo = new Curso(); //exemplo de Polimorfismo

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDaniel = new Dev();
        devDaniel.setNome("Daniel");
        devDaniel.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos Daniel"+ devDaniel.getConteudosInscritos());
        devDaniel.progredir();
        devDaniel.progredir();
        System.out.println("-");
        System.out.println("Conteudo Inscritos Daniel" + devDaniel.getConteudosInscritos());
        System.out.println("Conteudo Concluidos Daniel" + devDaniel.getConteudosConcluidos());
        System.out.println("XP"+devDaniel.calcularTotalXp());


        System.out.println("-------------------------------------------------------------------------------------------------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscrito Camila "+ devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudo Inscritos Camila"+ devCamila.getConteudosInscritos());
        System.out.println("Conteudo Concluido Camila"+ devCamila.getConteudosConcluidos());
        System.out.println("XP"+devCamila.calcularTotalXp());

        System.out.println("_________________________________________________________________________________________________________");

        Dev devJava1 = new Dev();
        devJava1.setNome("Javancleyson");
        System.out.println("Conteudo Inscrito Javancleyson "+ devJava1.getConteudosInscritos());

        devJava1.progredir();


    }

}
