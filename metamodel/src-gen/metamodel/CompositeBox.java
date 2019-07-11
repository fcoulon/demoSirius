/**
 */
package metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel.CompositeBox#getBoxes <em>Boxes</em>}</li>
 * </ul>
 *
 * @see metamodel.MetamodelPackage#getCompositeBox()
 * @model
 * @generated
 */
public interface CompositeBox extends Box {
	/**
	 * Returns the value of the '<em><b>Boxes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boxes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boxes</em>' reference.
	 * @see #setBoxes(Box)
	 * @see metamodel.MetamodelPackage#getCompositeBox_Boxes()
	 * @model
	 * @generated
	 */
	Box getBoxes();

	/**
	 * Sets the value of the '{@link metamodel.CompositeBox#getBoxes <em>Boxes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boxes</em>' reference.
	 * @see #getBoxes()
	 * @generated
	 */
	void setBoxes(Box value);

} // CompositeBox
