package wyz.jingangHotel02.ssm.autoPo;

public class Member {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.memberID
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    private String memberid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.scoreID
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    private String scoreid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.rank
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    private Integer rank;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.memberID
     *
     * @return the value of member.memberID
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    public String getMemberid() {
        return memberid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.memberID
     *
     * @param memberid the value for member.memberID
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    public void setMemberid(String memberid) {
        this.memberid = memberid == null ? null : memberid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.scoreID
     *
     * @return the value of member.scoreID
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    public String getScoreid() {
        return scoreid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.scoreID
     *
     * @param scoreid the value for member.scoreID
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    public void setScoreid(String scoreid) {
        this.scoreid = scoreid == null ? null : scoreid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.rank
     *
     * @return the value of member.rank
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.rank
     *
     * @param rank the value for member.rank
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    public void setRank(Integer rank) {
        this.rank = rank;
    }
}