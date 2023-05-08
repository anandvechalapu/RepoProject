@Repository
public interface StudentRepository extends JpaRepository<Student__c, Long> {
    
    @Transactional
    @Modifying
    @Query("UPDATE Student__c SET Mobile = :phoneNumber WHERE Mobile IS NULL OR Mobile = ''")
    int updateMobileField(@Param("phoneNumber") String phoneNumber);
}