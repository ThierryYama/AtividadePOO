<?php
    class Bolo{
    public $cobertura;
    public $recheio;
    public $tamanho;
        public function listarPartes():void{
            echo "Tamanho do Bolo: $this->tamanho, cobertura: $this->cobertura e recheio: $this->recheio";
        } 
        
    }