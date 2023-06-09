package Projeto.modelo.cinema;

public class Sala {
    private String[] listaSessao = new String[4];
    Sessao[] cadeiras = new Sessao[16];
    Sessao[] cadeirasCopia = new Sessao[16];
    private int posicaoLista;
    private String ListaQuantidadeCadeiras[] = new String[1000];
    Sessao sessao = new Sessao();
    private int contCadeira = 0;

    public int getContCadeira() {
        return contCadeira;
    }

    public void setContCadeira(int conCadeira) {
        this.contCadeira = conCadeira;
    }

    public Sala() {
        preencherHorario();
        criarCadeirasPcadaSala();
    }

    public void preencherHorario() {
        String horario1, horario2, horario3, horario4;
        horario1 = "10:00";
        horario2 = "12:00";
        horario3 = "14:00";
        horario4 = "24:00";
        listaSessao[0] = horario1;
        listaSessao[1] = horario2;
        listaSessao[2] = horario3;
        listaSessao[3] = horario4;
    }

    public Sessao[] getCadeirasCopia() {
        return cadeirasCopia;
    }

    public void setCadeirasCopia(Sessao[] cadeirasCopia) {
        this.cadeirasCopia = cadeirasCopia;
    }

    public Sessao[] getCadeiras() {
        return cadeiras;
    }

    public void setCadeiras(Sessao[] cadeiras) {
        this.cadeiras = cadeiras;
    }

    public int getPosicaoLista() {
        return posicaoLista;
    }

    public void setPosicaoLista(int posicaoLista) {
        this.posicaoLista = posicaoLista;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public String[] getListaSessao() {
        return listaSessao;
    }

    public void setListaSessao(String[] listaSessao) {
        this.listaSessao = listaSessao;
    }

    public String[] getListaQuantidadeCadeiras() {
        return ListaQuantidadeCadeiras;
    }

    public void setListaQuantidadeCadeiras(String[] listaQuantidadeCadeiras) {
        ListaQuantidadeCadeiras = listaQuantidadeCadeiras;
    }

    public void exibirSala1() {
        System.out.println("Opções dos horários e dos filmes:");
        for (int i = 0; i < 4; i++) {
            System.out.println(i + " - " + listaSessao[i] + " " +
                    sessao.getListaFilme()[i]);
        }
        System.out.println("");
    }

    public void exibirSala2() {
        System.out.println("Opções dos horários e dos filmes:");
        for (int i = 0; i < 3; i++) {
            System.out.println(i + " - " + listaSessao[i] + " " +
                    sessao.getListaFilme()[i + 1]);
        }
        System.out.println("3 - " + listaSessao[3] + " " + sessao.getListaFilme()[0]);
        System.out.println("");
    }

    public void exibirSala3() {
        System.out.println("Opções dos horários e dos filmes:");
        for (int i = 0; i < 2; i++) {
            System.out.println(i + " - " + listaSessao[i] + " " +
                    sessao.getListaFilme()[i + 2]);
        }
        System.out.println("2 - " + listaSessao[2] + " " + sessao.getListaFilme()[0]);
        System.out.println("3 - " + listaSessao[3] + " " + sessao.getListaFilme()[1]);
        System.out.println("");
    }

    public void exibirSala4() {
        System.out.println("Opções dos horários e dos filmes:");
        System.out.println("0 - " + listaSessao[0] + " " + sessao.getListaFilme()[3]);
        System.out.println("1 - " + listaSessao[1] + " " + sessao.getListaFilme()[0]);
        System.out.println("2 - " + listaSessao[2] + " " + sessao.getListaFilme()[1]);
        System.out.println("3 - " + listaSessao[3] + " " + sessao.getListaFilme()[2]);
        System.out.println("");
    }

    public void preencherCadeira(String posicao, int numeroDaSala, int horarioDoFilme,
            int contador) {
        int i, j;
        posicaoLista = (numeroDaSala - 1) * 4 + horarioDoFilme;
        contCadeira = 0;
        sessao = getCadeiras()[posicaoLista];
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 15; j++) {
                if (sessao.getCadeiras()[i][j].equalsIgnoreCase(posicao)) {
                    ListaQuantidadeCadeiras[contador] = sessao.getCadeiras()[i][j];
                    sessao.getCadeiras()[i][j] = " X" + posicao;
                    contCadeira--;
                }
                contCadeira++;
            }
        }
        contCadeira++;
    }

    public void criarCadeirasPcadaSala() {
        for (int i = 0; i < 16; i++) {
            Sessao novo = new Sessao();
            novo.criarCadeiras();
            cadeiras[i] = novo;
        }
    }

    public void exibirCadeiras(int numeroDaSala, int horarioDoFilme) {
        int i, j;
        posicaoLista = (numeroDaSala - 1) * 4 + horarioDoFilme;
        sessao = getCadeiras()[posicaoLista];
        System.out.println("Cadeiras disponíveis:\n ");
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 15; j++) {
                System.out.print(sessao.getCadeiras()[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void clonar(int teste) {
        Sessao[] cadeirasCopia = new Sessao[16];
        for (int i = 0; i < 16; i++) {
            Sessao novo = new Sessao();
            novo.criarCadeiras();
            cadeirasCopia[i] = novo;
        }
        if (teste == 1) {
            cadeirasCopia = this.cadeiras;
        } else {
            this.cadeiras = cadeirasCopia;
        }
    }

}
