package wyz.jingangHotel02.ssm.autoPo;

public class Rank {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rank.rankID
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    private Integer rankid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rank.rank
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    private String rank;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rank.discount
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    private Double discount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rank.rankID
     *
     * @return the value of rank.rankID
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    public Integer getRankid() {
        return rankid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rank.rankID
     *
     * @param rankid the value for rank.rankID
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    public void setRankid(Integer rankid) {
        this.rankid = rankid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rank.rank
     *
     * @return the value of rank.rank
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    public String getRank() {
        return rank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rank.rank
     *
     * @param rank the value for rank.rank
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    public void setRank(String rank) {
        this.rank = rank == null ? null : rank.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rank.discount
     *
     * @return the value of rank.discount
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rank.discount
     *
     * @param discount the value for rank.discount
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}