package com.example.SP_Demo_postgres.repos;

import com.example.SP_Demo_postgres.dto.EmployeeDepartmentDTO;
import com.example.SP_Demo_postgres.dto.EmployeeLeavesDTO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    public List<EmployeeDepartmentDTO> getEmployeeDepartmentData() {
        List<Object[]> results = entityManager
                .createNativeQuery("SELECT * FROM get_employee_department_data()")
                .getResultList();

        List<EmployeeDepartmentDTO> dtos = new ArrayList<>();
        for (Object[] row : results) {
            EmployeeDepartmentDTO dto = new EmployeeDepartmentDTO();
            dto.setEmpId(((Integer) row[0]));
            dto.setEmpName((String) row[1]);
            dto.setDeptName((String) row[2]);
            dtos.add(dto);
        }
        return dtos;
    }

}

