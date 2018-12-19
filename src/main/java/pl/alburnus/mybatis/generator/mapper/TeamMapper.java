package pl.alburnus.mybatis.generator.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pl.alburnus.mybatis.generator.entity.Team;
import pl.alburnus.mybatis.generator.entity.TeamExample;

public interface TeamMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team
     *
     * @mbg.generated
     */
    long countByExample(TeamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team
     *
     * @mbg.generated
     */
    int deleteByExample(TeamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team
     *
     * @mbg.generated
     */
    int insert(Team record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team
     *
     * @mbg.generated
     */
    int insertSelective(Team record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team
     *
     * @mbg.generated
     */
    List<Team> selectByExample(TeamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team
     *
     * @mbg.generated
     */
    Team selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Team record, @Param("example") TeamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Team record, @Param("example") TeamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Team record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Team record);
}