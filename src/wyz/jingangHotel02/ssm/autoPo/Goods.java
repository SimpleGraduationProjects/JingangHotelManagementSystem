package wyz.jingangHotel02.ssm.autoPo;

public class Goods {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.goodsID
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    private Integer goodsid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.goodsName
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    private String goodsname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.score
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    private Integer score;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.img
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    private String img;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.status
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.goodsID
     *
     * @return the value of goods.goodsID
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    public Integer getGoodsid() {
        return goodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.goodsID
     *
     * @param goodsid the value for goods.goodsID
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.goodsName
     *
     * @return the value of goods.goodsName
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    public String getGoodsname() {
        return goodsname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.goodsName
     *
     * @param goodsname the value for goods.goodsName
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.score
     *
     * @return the value of goods.score
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    public Integer getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.score
     *
     * @param score the value for goods.score
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.img
     *
     * @return the value of goods.img
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    public String getImg() {
        return img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.img
     *
     * @param img the value for goods.img
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.status
     *
     * @return the value of goods.status
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.status
     *
     * @param status the value for goods.status
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}