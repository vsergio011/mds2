import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

class VistaModificardatos extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; padding: var(--lumo-space-l);">
 <vaadin-text-field label="Nombre" placeholder="Placeholder" id="nomreInput"></vaadin-text-field>
 <vaadin-text-field label="Apellidos" placeholder="Placeholder" id="apellidosInput"></vaadin-text-field>
 <vaadin-text-field label="Email" placeholder="Placeholder" id="emailInput"></vaadin-text-field>
 <vaadin-text-field label="DNI" placeholder="Placeholder" id="dniInput"></vaadin-text-field>
 <vaadin-text-field label="Nombre de usuario" placeholder="Placeholder" id="nombreUsuarioInput"></vaadin-text-field>
 <vaadin-text-field label="Dirección completa" placeholder="Placeholder" id="direccionInput"></vaadin-text-field>
 <vaadin-text-field label="Datos de pago" placeholder="Placeholder" id="datosPagoInput"></vaadin-text-field>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-modificardatos';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaModificardatos.is, VistaModificardatos);
