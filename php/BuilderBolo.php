<?php

class BuilderBolo implements Builder
{

    private $bolo;

    public function __construct()
    {
        $this->reset();
    }

    public function reset(): void
    {
        $this->bolo = new Bolo();
    }
    public function adicionarCobertura($cobertura): void
    {
        $this->bolo->cobertura = $cobertura;
    }

    public function adicionarRecheio($recheio): void
    {
        $this->bolo->recheio = $recheio;
    }

    public function adicionarTamanho($tamanho): void
    {
        $this->bolo->tamanho = $tamanho;
    }

    public function getBolo(): Bolo
    {
        $resultado = $this->bolo;
        $this->reset();
        return $resultado;
    }
}
