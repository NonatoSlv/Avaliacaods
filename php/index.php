<?php
require_once "Pessoa.php";
require_once "Professor.php";
require_once "Aluno.php";

$professor = new Professor("Wagner", 40);
$aluno = new Aluno("Juliana", 19);

echo "<strong>Professor:</strong> ";
$professor->falar(); 

echo "<strong>Aluno:</strong> ";
$aluno->falar();

echo "<strong>Troca de Nome:</strong><br>";
$aluno->trocarNome("Beatriz"); 
$professor->trocarNome("Francisco"); 
?>
