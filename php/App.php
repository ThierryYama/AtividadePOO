<?php

require 'Bolo.php';
require 'Builder.php';
require 'BuilderBolo.php';
require 'Diretor.php';

function atenderCliente(Diretor $diretor)
{
    #fonte -> https://refactoring.guru/design-patterns/builder/php/example
    $builder = new BuilderBolo();
    $diretor->setBuilder($builder);

    echo "Bolo Pequeno Sem Recheio:\n";
    $diretor->buildBoloPequenoSemRecheio();
    $builder->getBolo()->listarPartes();

    echo "\nBolo Grande:\n";
    $diretor->buildBoloGrande();
    $builder->getBolo()->listarPartes();

    echo "\nBolo Customizado:\n";
    $builder->adicionarCobertura("Laranja");
    $builder->adicionarRecheio("Amora"); # Essa forma seria sem utilizar a classe "diretor" do jeito que foi colocado na pesquisa!!
    $builder->adicionarTamanho("2 andares");
    $builder->getBolo()->listarPartes();
}

$diretor = new Diretor();
atenderCliente($diretor);
