
// classe do tipo árvore

class Tree {
    No raiz; //ponteiro, Raiz da minha árvore, onde todas as folhas vão nascer

    // Inserção
    void Inserir(int info){
        raiz = InserirRec(raiz,info);
    }

    //Criando o meu Inserir Recursivo

    No InserirRec(No atual, int info){

        if(atual == null ){ // Caso 1: árvore vazia ou subarvore vazia
            return new No(info); 
        }
        else{
            if(info < atual.info){ //Caso 2: Árvore/subarvore com valor, é aqui que decimos para onde ele vai
                atual.esq = InserirRec(atual.esq, info); //Se menor que a raiz, o no vai para a esquerda e eu chamo novamente a minha função.
            }
            else{
                if(info > atual.info){ //Caso 3: se maior, chamo novamente a função para o nó da direita
                    atual.dir = InserirRec(atual.dir, info);
                
            }
        }

        return atual;
    }



    //Busca
}