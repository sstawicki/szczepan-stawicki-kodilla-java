package com.kodilla.good.patterns.food2door;

public class Application {
    public static void main(String[] args){
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve("Ham", 20);

        OrderProcessor orderProcessor = new OrderProcessor(new InfoOrderService());
        orderProcessor.process(orderRequest);
    }
}
