Produtos.php
<?php
    class Produtos{
        public $nome;
        public $valorUN;
        public $qtd;
        public $valortotal;

public function calcularvalor(){
            $this->valortotal = $this->valorUN * $this->qtd;
            return $this->valortotal;
        }
    }
?>

Vendas.php
<?php
    class Vendas{
        public $produtos;
        public $valor;
        public $numprod = 0;
        
        public function calc_valor(){
            $this->valor = 0;
            for ($i=0; $i<$this->numprod; $i++) {
                $this->valor+= $this->produtos[$i]->valortotal;
            }

}

        public function imprimir(){
            $this->calc_valor();
            echo "Valor total da venda: ".$this->valor."R$";
            echo "<br>" . "- Produtos -";
            for ($i=0; $i<$this->numprod; $i++) {
                echo "<br>" .
                "Produto: ".$this->produtos[$i]->nome .
                "<br>" .
                "Valor unitário: ".$this->produtos[$i]->valorUN .
                "<br>" .
                "Quantidade: ".$this->produtos[$i]->qtd .
                "<br>" .
                "Valor total: ".$this->produtos[$i]->valortotal .
                "<br>";
}
}
}
Index1.php

$p1 = new Produtos();
    $p1->nome = "chá";
    $p1->valorUN = 3.50;
    $p1->qtd = 2;
    $p1->calcularvalor();

$p2 = new Produtos();
    $p2->nome = "coca-cola";
    $p2->valorUN = 5;
    $p2->qtd = 4;
    $p2->calcularvalor();


$venda = new Vendas();
    $venda->produtos[0] = $p1;
    $venda->numprod++;
    $venda->produtos[1] = $p2;
    $venda->numprod++;
    $venda->imprimir();


?>
