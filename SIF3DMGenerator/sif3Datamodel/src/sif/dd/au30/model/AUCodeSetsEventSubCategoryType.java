
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsEventSubCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsEventSubCategoryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="B1a"/>
 *     &lt;enumeration value="B1b"/>
 *     &lt;enumeration value="B1c"/>
 *     &lt;enumeration value="B1d"/>
 *     &lt;enumeration value="B1e"/>
 *     &lt;enumeration value="B1f"/>
 *     &lt;enumeration value="B1g"/>
 *     &lt;enumeration value="B1h"/>
 *     &lt;enumeration value="B1i"/>
 *     &lt;enumeration value="B2a"/>
 *     &lt;enumeration value="B2b"/>
 *     &lt;enumeration value="B2c"/>
 *     &lt;enumeration value="B2d"/>
 *     &lt;enumeration value="B2e"/>
 *     &lt;enumeration value="B3a"/>
 *     &lt;enumeration value="B3b"/>
 *     &lt;enumeration value="B3c"/>
 *     &lt;enumeration value="B3d"/>
 *     &lt;enumeration value="B3e"/>
 *     &lt;enumeration value="B3f"/>
 *     &lt;enumeration value="B3g"/>
 *     &lt;enumeration value="B3h"/>
 *     &lt;enumeration value="B3i"/>
 *     &lt;enumeration value="B3j"/>
 *     &lt;enumeration value="B4a"/>
 *     &lt;enumeration value="B4b"/>
 *     &lt;enumeration value="B4c"/>
 *     &lt;enumeration value="B4d"/>
 *     &lt;enumeration value="B4e"/>
 *     &lt;enumeration value="B4f"/>
 *     &lt;enumeration value="B4g"/>
 *     &lt;enumeration value="B4h"/>
 *     &lt;enumeration value="B4i"/>
 *     &lt;enumeration value="B4j"/>
 *     &lt;enumeration value="B5a"/>
 *     &lt;enumeration value="B5b"/>
 *     &lt;enumeration value="B5c"/>
 *     &lt;enumeration value="B5d"/>
 *     &lt;enumeration value="B5e"/>
 *     &lt;enumeration value="B5f"/>
 *     &lt;enumeration value="B5g"/>
 *     &lt;enumeration value="B5h"/>
 *     &lt;enumeration value="B5i"/>
 *     &lt;enumeration value="B5j"/>
 *     &lt;enumeration value="B5k"/>
 *     &lt;enumeration value="B5l"/>
 *     &lt;enumeration value="B5m"/>
 *     &lt;enumeration value="B5n"/>
 *     &lt;enumeration value="B5o"/>
 *     &lt;enumeration value="B6a"/>
 *     &lt;enumeration value="B6b"/>
 *     &lt;enumeration value="B6c"/>
 *     &lt;enumeration value="B6d"/>
 *     &lt;enumeration value="B6e"/>
 *     &lt;enumeration value="B6f"/>
 *     &lt;enumeration value="B6g"/>
 *     &lt;enumeration value="B6h"/>
 *     &lt;enumeration value="B6i"/>
 *     &lt;enumeration value="B7a"/>
 *     &lt;enumeration value="B7b"/>
 *     &lt;enumeration value="B7c"/>
 *     &lt;enumeration value="B7d"/>
 *     &lt;enumeration value="B7e"/>
 *     &lt;enumeration value="B7f"/>
 *     &lt;enumeration value="B7g"/>
 *     &lt;enumeration value="B7h"/>
 *     &lt;enumeration value="B7i"/>
 *     &lt;enumeration value="B7j"/>
 *     &lt;enumeration value="B7k"/>
 *     &lt;enumeration value="B7l"/>
 *     &lt;enumeration value="B7m"/>
 *     &lt;enumeration value="B7n"/>
 *     &lt;enumeration value="B8a"/>
 *     &lt;enumeration value="B8b"/>
 *     &lt;enumeration value="B8c"/>
 *     &lt;enumeration value="B8d"/>
 *     &lt;enumeration value="B8e"/>
 *     &lt;enumeration value="B8f"/>
 *     &lt;enumeration value="B8g"/>
 *     &lt;enumeration value="B8h"/>
 *     &lt;enumeration value="B9a"/>
 *     &lt;enumeration value="B9b"/>
 *     &lt;enumeration value="B9c"/>
 *     &lt;enumeration value="B9d"/>
 *     &lt;enumeration value="B9e"/>
 *     &lt;enumeration value="B9f"/>
 *     &lt;enumeration value="B9g"/>
 *     &lt;enumeration value="B9h"/>
 *     &lt;enumeration value="B9i"/>
 *     &lt;enumeration value="B9j"/>
 *     &lt;enumeration value="M1a"/>
 *     &lt;enumeration value="M1b"/>
 *     &lt;enumeration value="M1c"/>
 *     &lt;enumeration value="M1d"/>
 *     &lt;enumeration value="M1e"/>
 *     &lt;enumeration value="M1f"/>
 *     &lt;enumeration value="M2a"/>
 *     &lt;enumeration value="M2b"/>
 *     &lt;enumeration value="M2c"/>
 *     &lt;enumeration value="M2d"/>
 *     &lt;enumeration value="M2e"/>
 *     &lt;enumeration value="M2f"/>
 *     &lt;enumeration value="M2g"/>
 *     &lt;enumeration value="M3a"/>
 *     &lt;enumeration value="M3b"/>
 *     &lt;enumeration value="M3c"/>
 *     &lt;enumeration value="M3d"/>
 *     &lt;enumeration value="M3e"/>
 *     &lt;enumeration value="M3f"/>
 *     &lt;enumeration value="M4a"/>
 *     &lt;enumeration value="M4b"/>
 *     &lt;enumeration value="M4c"/>
 *     &lt;enumeration value="M4d"/>
 *     &lt;enumeration value="M4e"/>
 *     &lt;enumeration value="M4f"/>
 *     &lt;enumeration value="M4g"/>
 *     &lt;enumeration value="M4h"/>
 *     &lt;enumeration value="M4i"/>
 *     &lt;enumeration value="M5a"/>
 *     &lt;enumeration value="M5b"/>
 *     &lt;enumeration value="M5c"/>
 *     &lt;enumeration value="M5d"/>
 *     &lt;enumeration value="M5e"/>
 *     &lt;enumeration value="M5f"/>
 *     &lt;enumeration value="M5g"/>
 *     &lt;enumeration value="M5h"/>
 *     &lt;enumeration value="M5i"/>
 *     &lt;enumeration value="M5j"/>
 *     &lt;enumeration value="M5k"/>
 *     &lt;enumeration value="M6a"/>
 *     &lt;enumeration value="M6b"/>
 *     &lt;enumeration value="M6c"/>
 *     &lt;enumeration value="M6d"/>
 *     &lt;enumeration value="M6e"/>
 *     &lt;enumeration value="M6f"/>
 *     &lt;enumeration value="M6g"/>
 *     &lt;enumeration value="M6h"/>
 *     &lt;enumeration value="M6i"/>
 *     &lt;enumeration value="M6j"/>
 *     &lt;enumeration value="M6k"/>
 *     &lt;enumeration value="M6l"/>
 *     &lt;enumeration value="M6n"/>
 *     &lt;enumeration value="M6o"/>
 *     &lt;enumeration value="M6p"/>
 *     &lt;enumeration value="M6q"/>
 *     &lt;enumeration value="M6r"/>
 *     &lt;enumeration value="M6s"/>
 *     &lt;enumeration value="M6t"/>
 *     &lt;enumeration value="M6u"/>
 *     &lt;enumeration value="M6v"/>
 *     &lt;enumeration value="M6w"/>
 *     &lt;enumeration value="M6x"/>
 *     &lt;enumeration value="M6y"/>
 *     &lt;enumeration value="M6z"/>
 *     &lt;enumeration value="M7a"/>
 *     &lt;enumeration value="M7b"/>
 *     &lt;enumeration value="M7c"/>
 *     &lt;enumeration value="M7d"/>
 *     &lt;enumeration value="M7e"/>
 *     &lt;enumeration value="M7f"/>
 *     &lt;enumeration value="M7g"/>
 *     &lt;enumeration value="M7h"/>
 *     &lt;enumeration value="M8a"/>
 *     &lt;enumeration value="M8b"/>
 *     &lt;enumeration value="M8c"/>
 *     &lt;enumeration value="M8d"/>
 *     &lt;enumeration value="M8e"/>
 *     &lt;enumeration value="M8f"/>
 *     &lt;enumeration value="M8g"/>
 *     &lt;enumeration value="M9a"/>
 *     &lt;enumeration value="M9b"/>
 *     &lt;enumeration value="M9c"/>
 *     &lt;enumeration value="M9d"/>
 *     &lt;enumeration value="M9e"/>
 *     &lt;enumeration value="M9f"/>
 *     &lt;enumeration value="M9g"/>
 *     &lt;enumeration value="M9h"/>
 *     &lt;enumeration value="M9i"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsEventSubCategoryType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsEventSubCategoryType {


    /**
     * Resolves issues peacefully
     * 
     */
    @XmlEnumValue("B1a")
    B_1_A("B1a"),

    /**
     * Plays in a friendly way
     * 
     */
    @XmlEnumValue("B1b")
    B_1_B("B1b"),

    /**
     * Uses equipment safely
     * 
     */
    @XmlEnumValue("B1c")
    B_1_C("B1c"),

    /**
     * Understands the purpose and need for rules
     * 
     */
    @XmlEnumValue("B1d")
    B_1_D("B1d"),

    /**
     * Seeks help from a responsible adult
     * 
     */
    @XmlEnumValue("B1e")
    B_1_E("B1e"),

    /**
     * Alerts others to risks and dangers
     * 
     */
    @XmlEnumValue("B1f")
    B_1_F("B1f"),

    /**
     * Moves away from danger
     * 
     */
    @XmlEnumValue("B1g")
    B_1_G("B1g"),

    /**
     * Uses protective interruption with peers
     * 
     */
    @XmlEnumValue("B1h")
    B_1_H("B1h"),

    /**
     * Observes and listens before acting
     * 
     */
    @XmlEnumValue("B1i")
    B_1_I("B1i"),

    /**
     * Helps someone or something in need
     * 
     */
    @XmlEnumValue("B2a")
    B_2_A("B2a"),

    /**
     * Shows empathy
     * 
     */
    @XmlEnumValue("B2b")
    B_2_B("B2b"),

    /**
     * Shows compassion
     * 
     */
    @XmlEnumValue("B2c")
    B_2_C("B2c"),

    /**
     * Is forgiving
     * 
     */
    @XmlEnumValue("B2d")
    B_2_D("B2d"),

    /**
     * Talks in a friendly way
     * 
     */
    @XmlEnumValue("B2e")
    B_2_E("B2e"),

    /**
     * Shows intercultural understanding
     * 
     */
    @XmlEnumValue("B3a")
    B_3_A("B3a"),

    /**
     * Acknowledges authority
     * 
     */
    @XmlEnumValue("B3b")
    B_3_B("B3b"),

    /**
     * Shows courtesy
     * 
     */
    @XmlEnumValue("B3c")
    B_3_C("B3c"),

    /**
     * Is polite
     * 
     */
    @XmlEnumValue("B3d")
    B_3_D("B3d"),

    /**
     * Accepts difference
     * 
     */
    @XmlEnumValue("B3e")
    B_3_E("B3e"),

    /**
     * Acknowledges the rights of others
     * 
     */
    @XmlEnumValue("B3f")
    B_3_F("B3f"),

    /**
     * Uses appropriate language/tone
     * 
     */
    @XmlEnumValue("B3g")
    B_3_G("B3g"),

    /**
     * Gives value to others' opinions
     * 
     */
    @XmlEnumValue("B3h")
    B_3_H("B3h"),

    /**
     * Maintains appropriate personal space
     * 
     */
    @XmlEnumValue("B3i")
    B_3_I("B3i"),

    /**
     * Shows consideration of impact of actions on others
     * 
     */
    @XmlEnumValue("B3j")
    B_3_J("B3j"),

    /**
     * Is honest
     * 
     */
    @XmlEnumValue("B4a")
    B_4_A("B4a"),

    /**
     * Acts with integrity
     * 
     */
    @XmlEnumValue("B4b")
    B_4_B("B4b"),

    /**
     * Self regulates
     * 
     */
    @XmlEnumValue("B4c")
    B_4_C("B4c"),

    /**
     * Co-regulates
     * 
     */
    @XmlEnumValue("B4d")
    B_4_D("B4d"),

    /**
     * Helps others to regulate
     * 
     */
    @XmlEnumValue("B4e")
    B_4_E("B4e"),

    /**
     * Is trustworthy
     * 
     */
    @XmlEnumValue("B4f")
    B_4_F("B4f"),

    /**
     * Copes with frustration
     * 
     */
    @XmlEnumValue("B4g")
    B_4_G("B4g"),

    /**
     * Accepts accountability
     * 
     */
    @XmlEnumValue("B4h")
    B_4_H("B4h"),

    /**
     * Owns consequences of actions
     * 
     */
    @XmlEnumValue("B4i")
    B_4_I("B4i"),

    /**
     * Is organised
     * 
     */
    @XmlEnumValue("B4j")
    B_4_J("B4j"),

    /**
     * Thinks critically
     * 
     */
    @XmlEnumValue("B5a")
    B_5_A("B5a"),

    /**
     * Is creative
     * 
     */
    @XmlEnumValue("B5b")
    B_5_B("B5b"),

    /**
     * Is timely
     * 
     */
    @XmlEnumValue("B5c")
    B_5_C("B5c"),

    /**
     * Takes considered risks
     * 
     */
    @XmlEnumValue("B5d")
    B_5_D("B5d"),

    /**
     * Takes a problem solving approach
     * 
     */
    @XmlEnumValue("B5e")
    B_5_E("B5e"),

    /**
     * Is adaptable
     * 
     */
    @XmlEnumValue("B5f")
    B_5_F("B5f"),

    /**
     * Shows independence
     * 
     */
    @XmlEnumValue("B5g")
    B_5_G("B5g"),

    /**
     * Takes initiative
     * 
     */
    @XmlEnumValue("B5h")
    B_5_H("B5h"),

    /**
     * Shows persistence
     * 
     */
    @XmlEnumValue("B5i")
    B_5_I("B5i"),

    /**
     * Shows courage
     * 
     */
    @XmlEnumValue("B5j")
    B_5_J("B5j"),

    /**
     * Negotiates
     * 
     */
    @XmlEnumValue("B5k")
    B_5_K("B5k"),

    /**
     * Is persuasive
     * 
     */
    @XmlEnumValue("B5l")
    B_5_L("B5l"),

    /**
     * Builds social support (networks)
     * 
     */
    @XmlEnumValue("B5m")
    B_5_M("B5m"),

    /**
     * Innovates
     * 
     */
    @XmlEnumValue("B5n")
    B_5_N("B5n"),

    /**
     * Shows determination
     * 
     */
    @XmlEnumValue("B5o")
    B_5_O("B5o"),

    /**
     * Pays attention
     * 
     */
    @XmlEnumValue("B6a")
    B_6_A("B6a"),

    /**
     * Tries hard
     * 
     */
    @XmlEnumValue("B6b")
    B_6_B("B6b"),

    /**
     * Completes work
     * 
     */
    @XmlEnumValue("B6c")
    B_6_C("B6c"),

    /**
     * Perseveres
     * 
     */
    @XmlEnumValue("B6d")
    B_6_D("B6d"),

    /**
     * Asks questions
     * 
     */
    @XmlEnumValue("B6e")
    B_6_E("B6e"),

    /**
     * Shows desire to learn
     * 
     */
    @XmlEnumValue("B6f")
    B_6_F("B6f"),

    /**
     * Stays on task
     * 
     */
    @XmlEnumValue("B6g")
    B_6_G("B6g"),

    /**
     * Participates constructively
     * 
     */
    @XmlEnumValue("B6h")
    B_6_H("B6h"),

    /**
     * Shows commitment to identified goals
     * 
     */
    @XmlEnumValue("B6i")
    B_6_I("B6i"),

    /**
     * Promotes justice
     * 
     */
    @XmlEnumValue("B7a")
    B_7_A("B7a"),

    /**
     * Follows rules and laws
     * 
     */
    @XmlEnumValue("B7b")
    B_7_B("B7b"),

    /**
     * Stands up for others appropriately
     * 
     */
    @XmlEnumValue("B7c")
    B_7_C("B7c"),

    /**
     * Puts others' needs before own
     * 
     */
    @XmlEnumValue("B7d")
    B_7_D("B7d"),

    /**
     * Contributes to the school/class
     * 
     */
    @XmlEnumValue("B7e")
    B_7_E("B7e"),

    /**
     * Contributes to the community
     * 
     */
    @XmlEnumValue("B7f")
    B_7_F("B7f"),

    /**
     * Is involved
     * 
     */
    @XmlEnumValue("B7g")
    B_7_G("B7g"),

    /**
     * Belongs
     * 
     */
    @XmlEnumValue("B7h")
    B_7_H("B7h"),

    /**
     * Promotes harmony
     * 
     */
    @XmlEnumValue("B7i")
    B_7_I("B7i"),

    /**
     * Gives back to the greater good
     * 
     */
    @XmlEnumValue("B7j")
    B_7_J("B7j"),

    /**
     * Becomes informed
     * 
     */
    @XmlEnumValue("B7k")
    B_7_K("B7k"),

    /**
     * Uses procedures and protocols
     * 
     */
    @XmlEnumValue("B7l")
    B_7_L("B7l"),

    /**
     * Participates in democratic decision making
     * 
     */
    @XmlEnumValue("B7m")
    B_7_M("B7m"),

    /**
     * Helps others to reach their goals
     * 
     */
    @XmlEnumValue("B7n")
    B_7_N("B7n"),

    /**
     * Is fair
     * 
     */
    @XmlEnumValue("B8a")
    B_8_A("B8a"),

    /**
     * Shows mutuality (sharing a feeling, action or relationship)
     * 
     */
    @XmlEnumValue("B8b")
    B_8_B("B8b"),

    /**
     * Shows reciprocity (“I scratch your back, you scratch mine)
     * 
     */
    @XmlEnumValue("B8c")
    B_8_C("B8c"),

    /**
     * Shows goodwill
     * 
     */
    @XmlEnumValue("B8d")
    B_8_D("B8d"),

    /**
     * Is attentive to others' reactions
     * 
     */
    @XmlEnumValue("B8e")
    B_8_E("B8e"),

    /**
     * Is open to dialogue/discussion
     * 
     */
    @XmlEnumValue("B8f")
    B_8_F("B8f"),

    /**
     * Works to be a valued member of a team
     * 
     */
    @XmlEnumValue("B8g")
    B_8_G("B8g"),

    /**
     * Offers others choices
     * 
     */
    @XmlEnumValue("B8h")
    B_8_H("B8h"),

    /**
     * Inspires others
     * 
     */
    @XmlEnumValue("B9a")
    B_9_A("B9a"),

    /**
     * Represents others
     * 
     */
    @XmlEnumValue("B9b")
    B_9_B("B9b"),

    /**
     * Delegates to others
     * 
     */
    @XmlEnumValue("B9c")
    B_9_C("B9c"),

    /**
     * Shows self confidence
     * 
     */
    @XmlEnumValue("B9d")
    B_9_D("B9d"),

    /**
     * Shows assertiveness
     * 
     */
    @XmlEnumValue("B9e")
    B_9_E("B9e"),

    /**
     * Stays positive
     * 
     */
    @XmlEnumValue("B9f")
    B_9_F("B9f"),

    /**
     * Shoulders blame
     * 
     */
    @XmlEnumValue("B9g")
    B_9_G("B9g"),

    /**
     * Sets an example
     * 
     */
    @XmlEnumValue("B9h")
    B_9_H("B9h"),

    /**
     * Communicates effectively
     * 
     */
    @XmlEnumValue("B9i")
    B_9_I("B9i"),

    /**
     * Shows wisdom
     * 
     */
    @XmlEnumValue("B9j")
    B_9_J("B9j"),

    /**
     * Striking - Staff
     * 
     */
    @XmlEnumValue("M1a")
    M_1_A("M1a"),

    /**
     * Pushing or barging - Staff
     * 
     */
    @XmlEnumValue("M1b")
    M_1_B("M1b"),

    /**
     * Use of a weapon or object - Staff
     * 
     */
    @XmlEnumValue("M1c")
    M_1_C("M1c"),

    /**
     * Projectile - Staff
     * 
     */
    @XmlEnumValue("M1d")
    M_1_D("M1d"),

    /**
     * Struggling to be free of a physical restraint - Staff
     * 
     */
    @XmlEnumValue("M1e")
    M_1_E("M1e"),

    /**
     * Unintentional but negligent contact - Staff
     * 
     */
    @XmlEnumValue("M1f")
    M_1_F("M1f"),

    /**
     * Verbal abuse - Staff
     * 
     */
    @XmlEnumValue("M2a")
    M_2_A("M2a"),

    /**
     * Non-Verbal abuse - Staff
     * 
     */
    @XmlEnumValue("M2b")
    M_2_B("M2b"),

    /**
     * Verbal threat - Staff
     * 
     */
    @XmlEnumValue("M2c")
    M_2_C("M2c"),

    /**
     * Threatening gesture - Staff
     * 
     */
    @XmlEnumValue("M2d")
    M_2_D("M2d"),

    /**
     * Disrespectful or challenging language - Staff
     * 
     */
    @XmlEnumValue("M2e")
    M_2_E("M2e"),

    /**
     * Malicious gossip - Staff
     * 
     */
    @XmlEnumValue("M2f")
    M_2_F("M2f"),

    /**
     * Sexual harassment - Staff
     * 
     */
    @XmlEnumValue("M2g")
    M_2_G("M2g"),

    /**
     * Striking - Student
     * 
     */
    @XmlEnumValue("M3a")
    M_3_A("M3a"),

    /**
     * Pushing or barging - Student
     * 
     */
    @XmlEnumValue("M3b")
    M_3_B("M3b"),

    /**
     * Use of a weapon or object - Student
     * 
     */
    @XmlEnumValue("M3c")
    M_3_C("M3c"),

    /**
     * Projectile - Student
     * 
     */
    @XmlEnumValue("M3d")
    M_3_D("M3d"),

    /**
     * Struggling to be free of violation of personal space or deprivation of liberty - Student
     * 
     */
    @XmlEnumValue("M3e")
    M_3_E("M3e"),

    /**
     * Unintentional but negligent contact - Student
     * 
     */
    @XmlEnumValue("M3f")
    M_3_F("M3f"),

    /**
     * Verbal abuse - Student
     * 
     */
    @XmlEnumValue("M4a")
    M_4_A("M4a"),

    /**
     * Non-Verbal abuse - Student
     * 
     */
    @XmlEnumValue("M4b")
    M_4_B("M4b"),

    /**
     * Verbal threat - Student
     * 
     */
    @XmlEnumValue("M4c")
    M_4_C("M4c"),

    /**
     * Threatening gesture - Student
     * 
     */
    @XmlEnumValue("M4d")
    M_4_D("M4d"),

    /**
     * Malicious gossip - Student
     * 
     */
    @XmlEnumValue("M4e")
    M_4_E("M4e"),

    /**
     * Exclusion of peer - Student
     * 
     */
    @XmlEnumValue("M4f")
    M_4_F("M4f"),

    /**
     * Teasing - Student
     * 
     */
    @XmlEnumValue("M4g")
    M_4_G("M4g"),

    /**
     * Unhelpful bystander actions - Student
     * 
     */
    @XmlEnumValue("M4h")
    M_4_H("M4h"),

    /**
     * Sexual harassment - Student
     * 
     */
    @XmlEnumValue("M4i")
    M_4_I("M4i"),

    /**
     * Theft of personal property
     * 
     */
    @XmlEnumValue("M5a")
    M_5_A("M5a"),

    /**
     * Theft of school property
     * 
     */
    @XmlEnumValue("M5b")
    M_5_B("M5b"),

    /**
     * Deliberate damage to personal property
     * 
     */
    @XmlEnumValue("M5c")
    M_5_C("M5c"),

    /**
     * Incidental damage through negligence
     * 
     */
    @XmlEnumValue("M5d")
    M_5_D("M5d"),

    /**
     * Graffiti
     * 
     */
    @XmlEnumValue("M5e")
    M_5_E("M5e"),

    /**
     * Buildings and glass
     * 
     */
    @XmlEnumValue("M5f")
    M_5_F("M5f"),

    /**
     * Fittings and fixtures
     * 
     */
    @XmlEnumValue("M5g")
    M_5_G("M5g"),

    /**
     * Furniture
     * 
     */
    @XmlEnumValue("M5h")
    M_5_H("M5h"),

    /**
     * Equipment
     * 
     */
    @XmlEnumValue("M5i")
    M_5_I("M5i"),

    /**
     * Vehicles
     * 
     */
    @XmlEnumValue("M5j")
    M_5_J("M5j"),

    /**
     * Garden and plants
     * 
     */
    @XmlEnumValue("M5k")
    M_5_K("M5k"),

    /**
     * Active refusal to follow reasonable instructions
     * 
     */
    @XmlEnumValue("M6a")
    M_6_A("M6a"),

    /**
     * Passive non-compliance
     * 
     */
    @XmlEnumValue("M6b")
    M_6_B("M6b"),

    /**
     * Disruptive
     * 
     */
    @XmlEnumValue("M6c")
    M_6_C("M6c"),

    /**
     * Defiant
     * 
     */
    @XmlEnumValue("M6d")
    M_6_D("M6d"),

    /**
     * Unclear boundaries
     * 
     */
    @XmlEnumValue("M6e")
    M_6_E("M6e"),

    /**
     * Erratic
     * 
     */
    @XmlEnumValue("M6f")
    M_6_F("M6f"),

    /**
     * Impulsive
     * 
     */
    @XmlEnumValue("M6g")
    M_6_G("M6g"),

    /**
     * Uninterested
     * 
     */
    @XmlEnumValue("M6h")
    M_6_H("M6h"),

    /**
     * Inattentive
     * 
     */
    @XmlEnumValue("M6i")
    M_6_I("M6i"),

    /**
     * Unresponsive
     * 
     */
    @XmlEnumValue("M6j")
    M_6_J("M6j"),

    /**
     * Unprepared
     * 
     */
    @XmlEnumValue("M6k")
    M_6_K("M6k"),

    /**
     * Out of bounds
     * 
     */
    @XmlEnumValue("M6l")
    M_6_L("M6l"),

    /**
     * Dress code breach without reasonable explanation
     * 
     */
    @XmlEnumValue("M6n")
    M_6_N("M6n"),

    /**
     * Lateness
     * 
     */
    @XmlEnumValue("M6o")
    M_6_O("M6o"),

    /**
     * Class-work avoidance
     * 
     */
    @XmlEnumValue("M6p")
    M_6_P("M6p"),

    /**
     * Unsafe
     * 
     */
    @XmlEnumValue("M6q")
    M_6_Q("M6q"),

    /**
     * Out of class without permission
     * 
     */
    @XmlEnumValue("M6r")
    M_6_R("M6r"),

    /**
     * Annoying
     * 
     */
    @XmlEnumValue("M6s")
    M_6_S("M6s"),

    /**
     * Inappropriate language
     * 
     */
    @XmlEnumValue("M6t")
    M_6_T("M6t"),

    /**
     * Academic dishonesty
     * 
     */
    @XmlEnumValue("M6u")
    M_6_U("M6u"),

    /**
     * Loud
     * 
     */
    @XmlEnumValue("M6v")
    M_6_V("M6v"),

    /**
     * Out of seat
     * 
     */
    @XmlEnumValue("M6w")
    M_6_W("M6w"),

    /**
     * Failure to use manners
     * 
     */
    @XmlEnumValue("M6x")
    M_6_X("M6x"),

    /**
     * Littering
     * 
     */
    @XmlEnumValue("M6y")
    M_6_Y("M6y"),

    /**
     * Disorderly
     * 
     */
    @XmlEnumValue("M6z")
    M_6_Z("M6z"),

    /**
     * Cigarette
     * 
     */
    @XmlEnumValue("M7a")
    M_7_A("M7a"),

    /**
     * Alcohol
     * 
     */
    @XmlEnumValue("M7b")
    M_7_B("M7b"),

    /**
     * Over-the-counter medication
     * 
     */
    @XmlEnumValue("M7c")
    M_7_C("M7c"),

    /**
     * ADHD medication
     * 
     */
    @XmlEnumValue("M7d")
    M_7_D("M7d"),

    /**
     * Other prescription medication
     * 
     */
    @XmlEnumValue("M7e")
    M_7_E("M7e"),

    /**
     * Aerosol
     * 
     */
    @XmlEnumValue("M7f")
    M_7_F("M7f"),

    /**
     * Solvents
     * 
     */
    @XmlEnumValue("M7g")
    M_7_G("M7g"),

    /**
     * Inappropriate sexual material
     * 
     */
    @XmlEnumValue("M7h")
    M_7_H("M7h"),

    /**
     * Knife or blade
     * 
     */
    @XmlEnumValue("M8a")
    M_8_A("M8a"),

    /**
     * Firearm
     * 
     */
    @XmlEnumValue("M8b")
    M_8_B("M8b"),

    /**
     * Amphetamines
     * 
     */
    @XmlEnumValue("M8c")
    M_8_C("M8c"),

    /**
     * Marijuana
     * 
     */
    @XmlEnumValue("M8d")
    M_8_D("M8d"),

    /**
     * Drug implement or paraphernalia
     * 
     */
    @XmlEnumValue("M8e")
    M_8_E("M8e"),

    /**
     * Other illegal drug
     * 
     */
    @XmlEnumValue("M8f")
    M_8_F("M8f"),

    /**
     * Other illegal weapon
     * 
     */
    @XmlEnumValue("M8g")
    M_8_G("M8g"),

    /**
     * Cyberbullying
     * 
     */
    @XmlEnumValue("M9a")
    M_9_A("M9a"),

    /**
     * Hacking
     * 
     */
    @XmlEnumValue("M9b")
    M_9_B("M9b"),

    /**
     * Breach of Department acceptable use agreement
     * 
     */
    @XmlEnumValue("M9c")
    M_9_C("M9c"),

    /**
     * Breach of Students Online policy
     * 
     */
    @XmlEnumValue("M9d")
    M_9_D("M9d"),

    /**
     * Persistent personal use of a MED when not permitted
     * 
     */
    @XmlEnumValue("M9e")
    M_9_E("M9e"),

    /**
     * Inappropriate audio or video recording
     * 
     */
    @XmlEnumValue("M9f")
    M_9_F("M9f"),

    /**
     * Inappropriate uploading of text, images or audio
     * 
     */
    @XmlEnumValue("M9g")
    M_9_G("M9g"),

    /**
     * Public posting of messages that bring the school or Department into disrepute
     * 
     */
    @XmlEnumValue("M9h")
    M_9_H("M9h"),

    /**
     * Copyright infringement or plagiarism
     * 
     */
    @XmlEnumValue("M9i")
    M_9_I("M9i");
    private final String value;

    AUCodeSetsEventSubCategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AUCodeSetsEventSubCategoryType fromValue(String v) {
        for (AUCodeSetsEventSubCategoryType c: AUCodeSetsEventSubCategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
