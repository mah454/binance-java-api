package com.binance.api.client.domain.account;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

/**
 * Futures Account information.
 */
@JsonIgnoreProperties
public class FuturesAccount {
    private int feeTier;
    private boolean canTrade;
    private boolean canDeposit;
    private boolean canWithdraw;
    private long updateTime;
    private String totalInitialMargin;
    private String totalMaintMargin;
    private String totalWalletBalance;
    private String totalUnrealizedProfit;
    private String totalMarginBalance;
    private String totalPositionInitialMargin;
    private String totalOpenOrderInitialMargin;
    private String totalCrossWalletBalance;
    private String totalCrossUnPnl;
    private String availableBalance;
    private String maxWithdrawAmount;

    private String multiAssetsMargin;

    private List<FuturesAssetBalance> assets;
    private List<FuturesPosition> positions;

    public int getFeeTier() {
        return feeTier;
    }

    public void setFeeTier(int feeTier) {
        this.feeTier = feeTier;
    }

    public boolean isCanTrade() {
        return canTrade;
    }

    public void setCanTrade(boolean canTrade) {
        this.canTrade = canTrade;
    }

    public boolean isCanDeposit() {
        return canDeposit;
    }

    public void setCanDeposit(boolean canDeposit) {
        this.canDeposit = canDeposit;
    }

    public boolean isCanWithdraw() {
        return canWithdraw;
    }

    public void setCanWithdraw(boolean canWithdraw) {
        this.canWithdraw = canWithdraw;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    public String getTotalInitialMargin() {
        return totalInitialMargin;
    }

    public void setTotalInitialMargin(String totalInitialMargin) {
        this.totalInitialMargin = totalInitialMargin;
    }

    public String getTotalMaintMargin() {
        return totalMaintMargin;
    }

    public void setTotalMaintMargin(String totalMaintMargin) {
        this.totalMaintMargin = totalMaintMargin;
    }

    public String getTotalWalletBalance() {
        return totalWalletBalance;
    }

    public void setTotalWalletBalance(String totalWalletBalance) {
        this.totalWalletBalance = totalWalletBalance;
    }

    public String getTotalUnrealizedProfit() {
        return totalUnrealizedProfit;
    }

    public void setTotalUnrealizedProfit(String totalUnrealizedProfit) {
        this.totalUnrealizedProfit = totalUnrealizedProfit;
    }

    public String getTotalMarginBalance() {
        return totalMarginBalance;
    }

    public void setTotalMarginBalance(String totalMarginBalance) {
        this.totalMarginBalance = totalMarginBalance;
    }

    public String getTotalPositionInitialMargin() {
        return totalPositionInitialMargin;
    }

    public void setTotalPositionInitialMargin(String totalPositionInitialMargin) {
        this.totalPositionInitialMargin = totalPositionInitialMargin;
    }

    public String getTotalOpenOrderInitialMargin() {
        return totalOpenOrderInitialMargin;
    }

    public void setTotalOpenOrderInitialMargin(String totalOpenOrderInitialMargin) {
        this.totalOpenOrderInitialMargin = totalOpenOrderInitialMargin;
    }

    public String getTotalCrossWalletBalance() {
        return totalCrossWalletBalance;
    }

    public void setTotalCrossWalletBalance(String totalCrossWalletBalance) {
        this.totalCrossWalletBalance = totalCrossWalletBalance;
    }

    public String getTotalCrossUnPnl() {
        return totalCrossUnPnl;
    }

    public void setTotalCrossUnPnl(String totalCrossUnPnl) {
        this.totalCrossUnPnl = totalCrossUnPnl;
    }

    public String getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(String availableBalance) {
        this.availableBalance = availableBalance;
    }

    public String getMaxWithdrawAmount() {
        return maxWithdrawAmount;
    }

    public void setMaxWithdrawAmount(String maxWithdrawAmount) {
        this.maxWithdrawAmount = maxWithdrawAmount;
    }

    public String getMultiAssetsMargin() {
        return multiAssetsMargin;
    }

    public void setMultiAssetsMargin(String multiAssetsMargin) {
        this.multiAssetsMargin = multiAssetsMargin;
    }

    public List<FuturesAssetBalance> getAssets() {
        return assets;
    }

    public List<FuturesPosition> getPositions() {
        return positions;
    }

    public void setPositions(List<FuturesPosition> positions) {
        this.positions = positions;
    }

    public void setAssets(List<FuturesAssetBalance> assets) {
        this.assets = assets;
    }

    public FuturesAssetBalance getAssetBalance(final String symbol) {
        return assets.stream()
                .filter(marginAssetBalance -> marginAssetBalance.getAsset().equals(symbol))
                .findFirst()
                .orElse(FuturesAssetBalance.of(symbol));
    }

    public FuturesPosition getPosition(final String symbol) {
        return positions.stream()
                .filter(e -> e.getSymbol().equals(symbol))
                .findFirst()
                .orElse(null);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("totalInitialMargin", totalInitialMargin)
                .append("totalMaintMargin", totalMaintMargin)
                .append("totalWalletBalance", totalWalletBalance)
                .append("totalUnrealizedProfit", totalUnrealizedProfit)
                .append("totalMarginBalance", totalMarginBalance)
                .append("totalPositionInitialMargin", totalPositionInitialMargin)
                .append("totalOpenOrderInitialMargin", totalOpenOrderInitialMargin)
                .append("totalCrossWalletBalance", totalCrossWalletBalance)
                .append("totalCrossUnPnl", totalCrossUnPnl)
                .append("availableBalance", availableBalance)
                .append("maxWithdrawAmount", maxWithdrawAmount)
                .toString();


    }
}
