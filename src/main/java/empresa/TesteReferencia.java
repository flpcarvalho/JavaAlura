package empresa;

public class TesteReferencia {
    public static void main(String[] args) {
        Funcionario g1 = new Gerente();
        g1.setNome("Felipe");
        g1.setSalario(5000.0);

        Funcionario f = new Funcionario();
        f.setSalario(2000.0);

        Funcionario ev = new EditorVideo();
        f.setSalario(2500.0);

        Funcionario d = new Designer();
        d.setSalario(3500.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(f);
        controle.registra(ev);
        controle.registra(d);

        System.out.println(controle.getSoma());

    }
}
