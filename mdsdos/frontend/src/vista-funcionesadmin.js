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
        			width: 100%;
                }
        .btnmenu{
        	background-color :#374453
        }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center;">
 <vaadin-vertical-layout style="align-self: center;">
  <vaadin-button id="addProductoBtn" class="btnmenu" style="width: 100%;">
    Añadir producto 
  </vaadin-button>
  <vaadin-button id="addCategoriaBtn" class="btnmenu" style="width: 100%;">
    Añadir categoria 
  </vaadin-button>
  <vaadin-button id="modificarEmpleadoBtn" class="btnmenu" style="width: 100%;">
    Modificar empleado 
  </vaadin-button>
 </vaadin-vertical-layout>
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
