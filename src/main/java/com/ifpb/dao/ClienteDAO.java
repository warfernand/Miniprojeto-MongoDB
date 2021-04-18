package com.ifpb.dao;

import com.ifpb.modelo.Cliente;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.set;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

public class ClienteDAO {

    CodecRegistry pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
            fromProviders(PojoCodecProvider.builder().automatic(true).build()));

    MongoClient mongoClient = new MongoClient("172.19.0.2", MongoClientOptions.builder().codecRegistry(pojoCodecRegistry).build());

    MongoDatabase database = mongoClient.getDatabase("miniprojeto")
            .withCodecRegistry(pojoCodecRegistry);

    MongoCollection<Cliente> collection = database.getCollection("Produto", Cliente.class);


    public Cliente Inserir(Cliente cliente){
        collection.insertOne(new Cliente(cliente.getId(), cliente.getNome(), cliente.getValorConsumo()));
        System.out.println("Cliente cadastrado com Sucesso!");
        return cliente;
    }

    public Cliente Buscar(int id){
        Cliente myDoc = collection.find(eq("_id", id)).first();
        System.out.println(myDoc.toString());
        return null;
    }

    public Cliente Atualizar(int id, String novoNome){
        collection.updateOne(new Document("_id", id),set("nome", novoNome));
        System.out.println("Cliente atualizado!");
        return null;
    }

    public Cliente Deletar(int id){
        collection.deleteOne(new Document("_id", id));
        System.out.println("Cliente deletado!");
        return null;
    }
}
