package com.ssm.dao;

import org.springframework.stereotype.Repository;

import com.ssm.pojo.UserRedPacket;

@Repository
public interface UserRedPacketDao {

	/**
	 * �����������Ϣ.
	 * @param userRedPacket �����������Ϣ
	 * @return Ӱ���¼��.
	 */
	public int grapRedPacket(UserRedPacket  userRedPacket);
}
