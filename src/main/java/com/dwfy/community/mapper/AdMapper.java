package com.dwfy.community.mapper;

import com.dwfy.community.model.Ad;
import com.dwfy.community.model.AdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AdMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AD
     *
     * @mbg.generated Sun Oct 06 16:33:30 CST 2019
     */
    long countByExample(AdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AD
     *
     * @mbg.generated Sun Oct 06 16:33:30 CST 2019
     */
    int deleteByExample(AdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AD
     *
     * @mbg.generated Sun Oct 06 16:33:30 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AD
     *
     * @mbg.generated Sun Oct 06 16:33:30 CST 2019
     */
    int insert(Ad record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AD
     *
     * @mbg.generated Sun Oct 06 16:33:30 CST 2019
     */
    int insertSelective(Ad record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AD
     *
     * @mbg.generated Sun Oct 06 16:33:30 CST 2019
     */
    List<Ad> selectByExampleWithRowbounds(AdExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AD
     *
     * @mbg.generated Sun Oct 06 16:33:30 CST 2019
     */
    List<Ad> selectByExample(AdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AD
     *
     * @mbg.generated Sun Oct 06 16:33:30 CST 2019
     */
    Ad selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AD
     *
     * @mbg.generated Sun Oct 06 16:33:30 CST 2019
     */
    int updateByExampleSelective(@Param("record") Ad record, @Param("example") AdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AD
     *
     * @mbg.generated Sun Oct 06 16:33:30 CST 2019
     */
    int updateByExample(@Param("record") Ad record, @Param("example") AdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AD
     *
     * @mbg.generated Sun Oct 06 16:33:30 CST 2019
     */
    int updateByPrimaryKeySelective(Ad record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AD
     *
     * @mbg.generated Sun Oct 06 16:33:30 CST 2019
     */
    int updateByPrimaryKey(Ad record);
}