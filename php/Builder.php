<?php

interface Builder{
    public function adicionarCobertura($cobertura): void;
    public function adicionarRecheio($recheio): void;
    public function adicionarTamanho($tamanho): void;
    public function getBolo(): Bolo;
}
