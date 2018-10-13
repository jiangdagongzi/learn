package com.learn.tao.learn.entity;


public class SuccessKill {

  private long seckillId;
  private long id;
  private long state;
  private java.sql.Timestamp createTime;
  private Seckill seckill;


  public long getSeckillId() {
    return seckillId;
  }

  public void setSeckillId(long seckillId) {
    this.seckillId = seckillId;
  }


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getState() {
    return state;
  }

  public void setState(long state) {
    this.state = state;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }

  @Override
  public String toString() {
    return "SuccessKill{" +
            "seckillId=" + seckillId +
            ", id=" + id +
            ", state=" + state +
            ", createTime=" + createTime +
            '}';
  }
}
