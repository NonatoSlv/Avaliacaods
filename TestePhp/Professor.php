<?php
require_once "Pessoa.php";
class Professor extends Pessoa {
    private $nome;
    private $idade;

    public function __construct($nome, $idade) {
        $this->nome = $nome;
        $this->idade = $idade;
        parent::__construct($nome, $idade);
    }

    public function getNome() {
        return $this->nome;
    }

    public function getIdade() {
        return $this->idade;
        
    }
    public function falar() {
        echo "Dando Aula<br>";
}
 }

?>
