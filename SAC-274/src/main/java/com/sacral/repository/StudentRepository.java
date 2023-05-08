@Repository
public interface StudentRepository extends JpaRepository<Student__c, Long> {
    @Modifying
    @Query("UPDATE Student__c SET Mobile = :mobile WHERE id = :id AND (Mobile IS NULL OR Mobile = '')")
    int updatePhoneNumber(@Param("mobile") String mobile, @Param("id") Long id);
    
    @Modifying
    @Query("UPDATE Student__c SET Mobile = :mobile WHERE id IN :ids AND (Mobile IS NULL OR Mobile = '')")
    int updatePhoneNumberForBulkInserts(@Param("mobile") String mobile, @Param("ids")Long[] ids);
}