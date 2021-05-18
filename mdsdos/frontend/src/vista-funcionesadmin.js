import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaFuncionesadmin extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-button id="addCategoriaBtn">
  Añadir categoria 
 </vaadin-button>
 <vaadin-button id="addProductoBtn">
  Añadir producto
 </vaadin-button>
 <vaadin-button id="modificarEmpleadoBtn">
  Modificar empleado
 </vaadin-button>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-funcionesadmin';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaFuncionesadmin.is, VistaFuncionesadmin);
