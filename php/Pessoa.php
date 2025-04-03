<?php
class Pessoa {
    private $nome;
    private $idade;

    public function __construct($nome, $idade) {
        $this->nome = $nome;
        $this->idade = $idade;
    }

    public function falar() {
        echo "Falando<br>";
    }

    public function trocarNome($novoNome) {
        if ($this->idade >= 18) {
            $this->nome = $novoNome;
            echo "Nome alterado para: $novoNome<br>";
        } else {
            echo "Não é possível alterar o nome, idade insuficiente.<br>";
        }
    }
}
?>
