package com.example.gleibsonalves.cardview.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gleibsonalves.cardview.R;
import com.example.gleibsonalves.cardview.model.Postagem;

import java.util.List;

/**
 * Created by Gleibson Alves on 2017-12-16.
 */

// A CLASS ADAPTER ESTA EXTENDENDO DE RECYCLERVIEW.ADAPTER, ENTRE AS CHAVES ESTA A INNERCLASS(Classe_Pai.InnerClass);
public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.MyViewHolder>{
    private List<Postagem> postagems;

    public PostagemAdapter(List<Postagem>listPostagems) {
        this.postagems = listPostagems;
    }

    //RECEBER O LAYOUT QUE CRIAMOS PARA SER EXIBIDO
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //RECEBER O LAYOUT EM XML(USANDO A CLASSE R.layout.nome_do_layout) E TRANSFORMANDO O XML(LAYOUT) EM UMA VIEW
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.postagem_detalhe,parent, false);

        /*VAI RETORNAR UMA INSTANCIA DE MyViewHolder (VAI RETORNAR O LAYOUT QUE CRIAMOS JA CONVERTIDO PARA VIEW)
        COLOCAMOS O NEW POS CADA CHAMDA DO CARDVIEW SERÁ UNICA OU SEJA, SE ESTIVER 100 CARDVIEW PRA MOSTAR SERÁ EXIBIDO 100 VEZES
         */
        return  new MyViewHolder(itemLista);
    }

    /*NESSE METODO NDA MAIS EH QUE SETAR OS VALORES RECEBIDOS OU SEJA IRAR RECEBER OS VALORES VIA POSIÇÃO PARA MOSTAR NA POSTAGE,

     */

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Postagem postagemViewHolder = postagems.get(position);
        holder.nome.setText(postagemViewHolder.getNome());
        holder.postagem.setText(postagemViewHolder.getPostagem());
        holder.imagem.setImageResource(postagemViewHolder.getImagem());

    }

    /*ESSE METODO RETORNA APENAS A QUANTIDADE DE VIEW QUE SERÁ MOSTRADO AO EXECULTAR O APP, ANTES DE O RECLYCLERVIEW ATUALIZAR-
    A LISTA, OU SEJA SERA MOSTRADO 6 ITEM QUANDO ENTRAR NO 7 ITEM O SISTEMA ELIMINA O ITEM QUE NÃO ESTA MAIS EM EVIDENCIA
     */
    @Override
    public int getItemCount() {
        return postagems.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView nome, postagem;
        private ImageView imagem;


        public MyViewHolder(View itemView) {
            super(itemView);
            nome = itemView.findViewById(R.id.textNome);
            postagem = itemView.findViewById(R.id.textPostagem);
           imagem = itemView.findViewById(R.id.imegenPostagem);

        }
    }

}
