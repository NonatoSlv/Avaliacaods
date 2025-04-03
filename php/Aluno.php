<?php
require_once "Pessoa.php";

class Aluno extends Pessoa {

    public function __construct($nome, $idade) {
        parent::__construct($nome, $idade);
    }
    
    public function falar() {
        echo "Perguntando<br>";
    }
}
?>
