package br.com.bianeck.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInCollection {

    private String nome;
    private PermissaoEnum permissao;

    public PredicateInCollection(String nome, PermissaoEnum permissao) {
        this.nome = nome;
        this.permissao = permissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PermissaoEnum getPermissao() {
        return permissao;
    }

    public void setPermissao(PermissaoEnum permissao) {
        this.permissao = permissao;
    }

    @Override
    public String toString() {
        return "Usuario: " + nome + ", Permissao: " + permissao.name().toLowerCase();
    }

    public static List<PredicateInCollection> processa(List<PredicateInCollection> usuarios, Predicate<PredicateInCollection> predicate) {

        List<PredicateInCollection> resultado = new ArrayList<>();
        for (PredicateInCollection usuario : usuarios)
            if(predicate.test(usuario))
                resultado.add(usuario);

        return resultado;
    }

    public static void main(String[] args) {

        List<PredicateInCollection> usuarios =
                Arrays.asList(
                        new PredicateInCollection("João", PermissaoEnum.ADMIN),
                        new PredicateInCollection("Pedro", PermissaoEnum.MEMBRO),
                        new PredicateInCollection("Mariana", PermissaoEnum.ADMIN)
                );

        List administradores = processa(usuarios, (PredicateInCollection u) -> PermissaoEnum.ADMIN.equals(u.getPermissao()));
        System.out.println(administradores);

        Predicate<PredicateInCollection> temAdmins = usuario -> PermissaoEnum.ADMIN.equals(usuario.getPermissao());

        List administradores2 =
                usuarios.stream()
                .filter(temAdmins)
                .collect(Collectors.toList());

        System.out.println(administradores2);
    }
}
