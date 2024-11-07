<?php

class Diretor
{
    private $builder;

    public function setBuilder(BuilderBolo $builder): void
    {
        $this->builder = $builder;
    }

    public function buildBoloPequenoSemRecheio(): void
    {
        $this->builder->adicionarCobertura("Chocolate");
        $this->builder->adicionarTamanho("Pequeno");
    }

    public function buildBoloGrande()
    {
        $this->builder->adicionarRecheio("Morango");
        $this->builder->adicionarCobertura("Abacaxi");
        $this->builder->adicionarTamanho("Grande");
    }


}





?>