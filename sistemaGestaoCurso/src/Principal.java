
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        SistemaGestaoCursos gestao = new SistemaGestaoCursos();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o caminho completo do arquivo de cursos: ");
        String arquivo_cursos = scanner.nextLine();
        gestao.carregarCursos(arquivo_cursos);

        scanner.reset();

        System.out.print("Digite o caminho completo do arquivo de alunos: ");
        String arquivo_alunos = scanner.nextLine();
        gestao.carregarAlunos(arquivo_alunos);

        scanner.close();

        // CASO QUEIRA VISUALIZAR OS ARRAYS DE ALUNOS E CURSOS DESCOMENTE
        /*
        for(int i=0; i<gestao.qtdCursos; i++){
            System.out.println(gestao.cursos[i].toString());
        }

        for(int i=0; i<gestao.qtdAlunos; i++){
            System.out.println(gestao.alunos[i].toString());
        }
        */

        Relatorio relatorio = new Relatorio();

        // gere o relatorioCursos.txt com cursos ordenados por preço final crescente.
        relatorio.salvarItensOrdenados("out/production/SistemaGestaodeCursos/FilesRelatorio/relatorioAlunos.txt",gestao);

        // gere o relatorioAlunos.txt com alunos ordenados pela maior média final.
        relatorio.salvarItensOrdenadosAlunos("atividade_vivencial_2/src/FilesRelatorio/relatorioAlunos.txt", gestao);

        //desafio extra
        gestao.listarAlunosComMediaAbaixo(8.0);

    }
}