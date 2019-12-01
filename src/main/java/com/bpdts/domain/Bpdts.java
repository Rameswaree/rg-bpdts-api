package com.bpdts.domain;

@Entity
@Table(name = "tblBpdts")
public class Bpdts implements Serializable{
  
  private static final long serialVersionUID = 7280549021416983975L;
  
    @Column(name = "intBpdtsId", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
  
    @Column(name = "firstName", nullable = true)
    private String firstName;
  
   @Column(name = "lastName", nullable = true)
    private String lastName;
  
  @Column(name = "email", nullable = true)
    private String email;
  
  @Column(name = "ip_address", nullable = true)
    private String ip_address;
  
  @Column(name = "latitude", nullable = true)
    private double latitude;
  
  @Column(name = "longitude", nullable = true)
    private String longitude;
  
  @Column(name = "city", nullable = true)
    private String city;
}
