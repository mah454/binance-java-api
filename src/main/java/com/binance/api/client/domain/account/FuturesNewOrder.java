package com.binance.api.client.domain.account;

import com.binance.api.client.constant.BinanceApiConstants;
import com.binance.api.client.domain.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * A trade order to enter or exit a position.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FuturesNewOrder {

    /**
     * Symbol to place the order on.
     */
    private String symbol;

    /**
     * Buy/Sell order side.
     */
    private OrderSide side;

    /**
     * Type of orderSide
     */
    private PositionSide positionSide;

    /**
     * Type of order.
     */
    private OrderType type;

    /**
     * Time in force to indicate how long will the order remain active.
     */
    private TimeInForce timeInForce;

    /**
     * Quantity.
     */
    private String quantity;

    /**
     * reduceOnly.
     */
    private Boolean reduceOnly;

    /**
     * Price.
     */
    private String price;

    /**
     * A unique id for the order. Automatically generated if not sent.
     */
    private String newClientOrderId;

    /**
     * Used with stop orders.
     */
    private String stopPrice;

    /**
     * Used with close position true/false used with STOP_MARKET or TAKE_PROFIT_MARKET.
     */
    private boolean closePosition;

    /**
     * Used with TRAILING_STOP_MARKET.
     */
    private String activationPrice;

    /**
     * callbackRate
     */
    private String callbackRate;

    /**
     * workingType
     */
    private WorkingType workingType;

    /**
     * priceProtect
     */
    private boolean priceProtect;

    /**
     * Set the response JSON. ACK, RESULT, or FULL; default: RESULT.
     */
    private NewOrderResponseType newOrderRespType;

    /**
     * Receiving window.
     */
    private Long recvWindow;

    /**
     * Order timestamp.
     */
    private long timestamp;

    public FuturesNewOrder() {
    }

    /**
     * Creates a new order with all required parameters.
     */

    public FuturesNewOrder(String symbol, OrderSide side, OrderType type, TimeInForce timeInForce, WorkingType workingType, String quantity, String price, boolean reduceOnly) {
        this.symbol = symbol;
        this.side = side;
        this.type = type;
        this.timeInForce = timeInForce;
        this.workingType = workingType;
        this.quantity = quantity;
        this.price = price;
        this.reduceOnly = reduceOnly;
        this.newOrderRespType = NewOrderResponseType.RESULT;
        this.timestamp = System.currentTimeMillis();
        this.recvWindow = BinanceApiConstants.DEFAULT_RECEIVING_WINDOW;
    }

    public FuturesNewOrder(String symbol, OrderSide side, OrderType type, String quantity, boolean reduceOnly) {
        this.symbol = symbol;
        this.side = side;
        this.type = type;
        this.quantity = quantity;
        this.reduceOnly = reduceOnly;
        this.newOrderRespType = NewOrderResponseType.RESULT;
        this.timestamp = System.currentTimeMillis();
        this.recvWindow = BinanceApiConstants.DEFAULT_RECEIVING_WINDOW;
    }

    public FuturesNewOrder(String symbol, OrderSide side, OrderType type, TimeInForce timeInForce, String quantity, String price, WorkingType workingType, boolean reduceOnly) {
        this.symbol = symbol;
        this.side = side;
        this.type = type;
        this.timeInForce = timeInForce;
        this.quantity = quantity;
        this.price = price;
        this.workingType = workingType;
        this.reduceOnly = reduceOnly;
        this.newOrderRespType = NewOrderResponseType.RESULT;
        this.timestamp = System.currentTimeMillis();
        this.recvWindow = BinanceApiConstants.DEFAULT_RECEIVING_WINDOW;
    }

    public FuturesNewOrder(String symbol, OrderSide side, OrderType type, TimeInForce timeInForce, WorkingType workingType, String quantity, String price) {
        this.symbol = symbol;
        this.side = side;
        this.type = type;
        this.timeInForce = timeInForce;
        this.workingType = workingType;
        this.quantity = quantity;
        this.price = price;
        this.newOrderRespType = NewOrderResponseType.RESULT;
        this.timestamp = System.currentTimeMillis();
        this.recvWindow = BinanceApiConstants.DEFAULT_RECEIVING_WINDOW;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public OrderSide getSide() {
        return side;
    }

    public void setSide(OrderSide side) {
        this.side = side;
    }

    public PositionSide getPositionSide() {
        return positionSide;
    }

    public void setPositionSide(PositionSide positionSide) {
        this.positionSide = positionSide;
    }

    public OrderType getType() {
        return type;
    }

    public void setType(OrderType type) {
        this.type = type;
    }

    public TimeInForce getTimeInForce() {
        return timeInForce;
    }

    public void setTimeInForce(TimeInForce timeInForce) {
        this.timeInForce = timeInForce;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Boolean isReduceOnly() {
        return reduceOnly;
    }

    public void setReduceOnly(Boolean reduceOnly) {
        this.reduceOnly = reduceOnly;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNewClientOrderId() {
        return newClientOrderId;
    }

    public void setNewClientOrderId(String newClientOrderId) {
        this.newClientOrderId = newClientOrderId;
    }

    public String getStopPrice() {
        return stopPrice;
    }

    public void setStopPrice(String stopPrice) {
        this.stopPrice = stopPrice;
    }

    public boolean isClosePosition() {
        return closePosition;
    }

    public void setClosePosition(boolean closePosition) {
        this.closePosition = closePosition;
    }

    public String getActivationPrice() {
        return activationPrice;
    }

    public void setActivationPrice(String activationPrice) {
        this.activationPrice = activationPrice;
    }

    public String getCallbackRate() {
        return callbackRate;
    }

    public void setCallbackRate(String callbackRate) {
        this.callbackRate = callbackRate;
    }

    public WorkingType getWorkingType() {
        return workingType;
    }

    public void setWorkingType(WorkingType workingType) {
        this.workingType = workingType;
    }

    public boolean isPriceProtect() {
        return priceProtect;
    }

    public void setPriceProtect(boolean priceProtect) {
        this.priceProtect = priceProtect;
    }

    public NewOrderResponseType getNewOrderRespType() {
        return newOrderRespType;
    }

    public void setNewOrderRespType(NewOrderResponseType newOrderRespType) {
        this.newOrderRespType = newOrderRespType;
    }

    public Long getRecvWindow() {
        return recvWindow;
    }

    public void setRecvWindow(Long recvWindow) {
        this.recvWindow = recvWindow;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public static FuturesNewOrder limitLong(String symbol, TimeInForce timeInForce, String quantity, String price, WorkingType workingType, boolean reduceOnly) {
        return new FuturesNewOrder(symbol, OrderSide.BUY, OrderType.LIMIT, timeInForce, quantity, price, workingType, reduceOnly);
    }

    public static FuturesNewOrder limitShort(String symbol, TimeInForce timeInForce, String quantity, String price, WorkingType workingType, boolean reduceOnly) {
        return new FuturesNewOrder(symbol, OrderSide.SELL, OrderType.LIMIT, timeInForce, quantity, price, workingType, reduceOnly);
    }

    public static FuturesNewOrder MarketLong(String symbol, String quantity, boolean reduceOnly) {
        return new FuturesNewOrder(symbol, OrderSide.BUY, OrderType.MARKET, quantity, reduceOnly);
    }

    public static FuturesNewOrder marketShort(String symbol, String quantity, boolean reduceOnly) {
        return new FuturesNewOrder(symbol, OrderSide.SELL, OrderType.MARKET, quantity, reduceOnly);
    }

    public static FuturesNewOrder stopLimitLong(String symbol, String quantity, String stopPrice, String price, WorkingType workingType, boolean reduceOnly) {
        FuturesNewOrder futuresNewOrder = new FuturesNewOrder(symbol, OrderSide.BUY, OrderType.STOP, quantity, reduceOnly);
        futuresNewOrder.setStopPrice(stopPrice);
        futuresNewOrder.setPrice(price);
        futuresNewOrder.workingType = workingType;
        return futuresNewOrder;
    }

    public static FuturesNewOrder stopLimitShort(String symbol, String quantity, String stopPrice, String price, WorkingType workingType, boolean reduceOnly) {
        FuturesNewOrder futuresNewOrder = new FuturesNewOrder(symbol, OrderSide.SELL, OrderType.STOP, quantity, reduceOnly);
        futuresNewOrder.setStopPrice(stopPrice);
        futuresNewOrder.setPrice(price);
        futuresNewOrder.workingType = workingType;
        return futuresNewOrder;
    }

    public static FuturesNewOrder stopMarket(String symbol, OrderSide orderSide, String stopPrice, WorkingType workingType) {
        FuturesNewOrder order = new FuturesNewOrder();
        order.setSymbol(symbol);
        order.setSide(orderSide);
        order.setStopPrice(stopPrice);
        order.setClosePosition(true);
        order.setWorkingType(workingType);
        order.setType(OrderType.STOP_MARKET);
        order.setNewOrderRespType(NewOrderResponseType.RESULT);
        order.setTimestamp(System.currentTimeMillis());
        order.setRecvWindow(BinanceApiConstants.DEFAULT_RECEIVING_WINDOW);
        return order;
    }

    public static FuturesNewOrder takeProfitMarket(String symbol, OrderSide orderSide, String stopPrice, WorkingType workingType) {
        FuturesNewOrder order = new FuturesNewOrder();
        order.setSymbol(symbol);
        order.setSide(orderSide);
        order.setStopPrice(stopPrice);
        order.setClosePosition(true);
        order.setWorkingType(workingType);
        order.setType(OrderType.TAKE_PROFIT_MARKET);
        order.setNewOrderRespType(NewOrderResponseType.RESULT);
        order.setTimestamp(System.currentTimeMillis());
        order.setRecvWindow(BinanceApiConstants.DEFAULT_RECEIVING_WINDOW);
        return order;
    }

    public static FuturesNewOrder limitHedgeOrder(String symbol, OrderSide orderSide, PositionSide positionSide, TimeInForce timeInForce, String quantity, String price,WorkingType workingType) {
        FuturesNewOrder order = new FuturesNewOrder();
        order.setSymbol(symbol);
        order.setType(OrderType.LIMIT);
        order.setPositionSide(positionSide);
        order.setSide(orderSide);
        order.setTimeInForce(timeInForce);
        order.setQuantity(quantity);
        order.setPrice(price);
        order.setWorkingType(workingType);
        order.setNewOrderRespType(NewOrderResponseType.RESULT);
        order.setTimestamp(System.currentTimeMillis());
        order.setRecvWindow(BinanceApiConstants.DEFAULT_RECEIVING_WINDOW);
        return order;
    }

    public static FuturesNewOrder stopLimitHedgeOrder(String symbol, OrderSide orderSide, PositionSide positionSide, TimeInForce timeInForce, String quantity, String stopPrice, String price,WorkingType workingType) {
        FuturesNewOrder order = new FuturesNewOrder();
        order.setSymbol(symbol);
        order.setType(OrderType.STOP);
        order.setPositionSide(positionSide);
        order.setSide(orderSide);
        order.setTimeInForce(timeInForce);
        order.setQuantity(quantity);
        order.setStopPrice(stopPrice);
        order.setPrice(price);
        order.setWorkingType(workingType);
        order.setNewOrderRespType(NewOrderResponseType.RESULT);
        order.setTimestamp(System.currentTimeMillis());
        order.setRecvWindow(BinanceApiConstants.DEFAULT_RECEIVING_WINDOW);
        return order;
    }

    public static FuturesNewOrder stopLoseHedgeOrder(String symbol, OrderSide orderSide, PositionSide positionSide, String stopPrice, WorkingType workingType) {
        FuturesNewOrder order = new FuturesNewOrder();
        order.setSymbol(symbol);
        order.setType(OrderType.STOP_MARKET);
        order.setPositionSide(positionSide);
        order.setSide(orderSide);
        order.setStopPrice(stopPrice);
        order.setClosePosition(true);
        order.setWorkingType(workingType);
        order.setNewOrderRespType(NewOrderResponseType.RESULT);
        order.setTimestamp(System.currentTimeMillis());
        order.setRecvWindow(BinanceApiConstants.DEFAULT_RECEIVING_WINDOW);
        return order;
    }

}