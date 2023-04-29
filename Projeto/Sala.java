package Projeto;

public class Sala {
    private String[] listaSessao = new String[4];
    Sessao[] cadeiras = new Sessao[16];
    private int posicaoLista;
    private String ListaQuantidadeCadeiras[] = new String[1000];
    Sessao sessao = new Sessao();

    public Sala() {
        preencherHorario();
        criarCadeirasPcadaSala();
    }

    public void preencherHorario() {
        String horario1, horario2, horario3, horario4;
        horario1 = "0 - 10:00 - 12:00";
        horario2 = "1 - 12:00 - 14:00";
        horario3 = "2 - 14:00 - 16:00";
        horario4 = "3 - 16:00 - 18:00";
        listaSessao[0] = horario1;
        listaSessao[1] = horario2;
        listaSessao[2] = horario3;
        listaSessao[3] = horario4;
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
            System.out.println(listaSessao[i] + " " + sessao.getListaFilme()[i]);
        }
        System.out.println("");
    }

    public void exibirSala2() {
        System.out.println("Opções dos horários e dos filmes:");
        for (int i = 0; i < 3; i++) {
            System.out.println(listaSessao[i] + " " + sessao.getListaFilme()[i + 1]);
        }
        System.out.println(listaSessao[3] + " " + sessao.getListaFilme()[0]);
        System.out.println("");
    }

    public void exibirSala3() {
        System.out.println("Opções dos horários e dos filmes:");
        for (int i = 0; i < 2; i++) {
            System.out.println(listaSessao[i] + " " + sessao.getListaFilme()[i + 2]);
        }
        System.out.println(listaSessao[2] + " " + sessao.getListaFilme()[0]);
        System.out.println(listaSessao[3] + " " + sessao.getListaFilme()[1]);
        System.out.println("");
    }

    public void exibirSala4() {
        System.out.println("Opções dos horários e dos filmes:");
        System.out.println(listaSessao[0] + " " + sessao.getListaFilme()[3]);
        System.out.println(listaSessao[1] + " " + sessao.getListaFilme()[0]);
        System.out.println(listaSessao[2] + " " + sessao.getListaFilme()[1]);
        System.out.println(listaSessao[3] + " " + sessao.getListaFilme()[2]);
        System.out.println("");
    }

    public int preencherCadeira(String posicao, int numeroDaSala, int horarioDoFilme,
            int contador) {
        int i = 0;
        int j = 0;
        int cont = 0;
        posicaoLista = (numeroDaSala - 1) * 4 + horarioDoFilme;
        Sessao aux = new Sessao();
        aux = getCadeiras()[posicaoLista];
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 15; j++) {
                if (aux.getCadeiras()[i][j].compareToIgnoreCase(posicao) == 0) {
                    aux.getCadeiras()[i][j] = " X" + posicao;
                    ListaQuantidadeCadeiras[contador] = aux.getCadeiras()[i][j];
                    break;
                }
                cont++;
            }
        }
        cont++;
        if (cont == 151) {
            System.out.println("Não foi possível realizar a inserção! a cadeira estáocupada ou inexistente");
            System.out.println("");
            return -1;
        }
        return 0;
    }

    public void criarCadeirasPcadaSala() {
        for (int i = 0; i < 16; i++) {
            Sessao novo = new Sessao();
            novo.criarCadeiras();
            cadeiras[i] = novo;
        }
    }

    public void exibirCadeiras(int numeroDaSala, int horarioDoFilme) {
        int i = 0;
        int j = 0;
        posicaoLista = (numeroDaSala - 1) * 4 + horarioDoFilme;
        Sessao aux = new Sessao();
        aux = getCadeiras()[posicaoLista];
        System.out.println("Cadeiras disponíveis:\n ");
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 15; j++) {
                System.out.print(aux.getCadeiras()[i][j] + " ");
            }
            System.out.println();
        }
    }

}
